import cv2
import numpy as np
import mediapipe as mp
import pyautogui
import pyttsx3
import time

class VirtualMouse:
    def _init_(self):
        self.mp_drawing = mp.solutions.drawing_utils
        self.mp_hands = mp.solutions.hands
        self.hands = self.mp_hands.Hands(max_num_hands=1)
        self.screen_width, self.screen_height = pyautogui.size()
        self.camera_width, self.camera_height = 1280, 720
        self.speed_factor = 2  # Adjust this value to change the speed
        self.left_click_gesture = False
        self.right_click_gesture = False
        self.scroll_gesture = False
        self.mouse_movement_gesture = False
        self.double_click_gesture = False
        self.last_click_time = 0
        self.virtual_mouse_on = True  # Assume virtual mouse is already turned on
        self.engine = pyttsx3.init()
        self.cap = cv2.VideoCapture(0)

    def speak_message(self, message):
        self.engine.say(message)
        self.engine.runAndWait()

    def detect_gestures(self, hand_landmarks):
        finger_coords = np.array([[l.x * self.camera_width, l.y * self.camera_height] for l in hand_landmarks.landmark])
        wrist_coords = np.array([hand_landmarks.landmark[0].x * self.camera_width, hand_landmarks.landmark[0].y * self.camera_height])

        # Detect thumb movement for mouse pointer control
        thumb_coords = finger_coords[4]
        self.mouse_movement_gesture = thumb_coords[0] < wrist_coords[0] - 50

        # Detect left-click gesture (raise middle finger when index finger is raised)
        self.left_click_gesture = finger_coords[8][1] < finger_coords[6][1] and finger_coords[12][1] > finger_coords[10][1]

    def process_frame(self):
        success, image = self.cap.read()
        if not success:
            print("Ignoring empty camera frame.")
            return None
        display_image = cv2.flip(image, 1)
        image_rgb = cv2.cvtColor(display_image, cv2.COLOR_BGR2RGB)
        results = self.hands.process(image_rgb)
        return display_image, results

    def run(self):
        self.speak_message("Press Esc key to exit the program.")
        while self.cap.isOpened():
            display_image, results = self.process_frame()
            if display_image is None:
                continue
            if results.multi_hand_landmarks and self.virtual_mouse_on:
                for hand_landmarks in results.multi_hand_landmarks:
                    self.mp_drawing.draw_landmarks(display_image, hand_landmarks, self.mp_hands.HAND_CONNECTIONS)
                    self.detect_gestures(hand_landmarks)
            cv2.imshow("Virtual Mouse", display_image)
            if cv2.waitKey(5) & 0xFF == 27:  # Press 'Esc' key to exit
                break
        self.cap.release()
        cv2.destroyAllWindows()

if _name_ == "_main_":
    virtual_mouse = VirtualMouse()
    virtual_mouse.run()