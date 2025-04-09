import cv2
import os

camera = cv2.VideoCapture("C:/Users/Keith Young/Pictures/Camera Roll/hand3.mp4")

count = 0
while(True):
   ret, frame = camera.read()
   if ret:
      # if video is still left continue creating images
      name = "hand3."+ str(count) + '.jpg'
      print ('new frame captured...' + name)

      cv2.imwrite(name, frame)
      count += 1
   else:
      break

camera.release()
cv2.destroyAllWindows()


