LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := libglbuddy
LOCAL_CFLAGS    := -Werror
LOCAL_SRC_FILES := glbuddy.cpp \
				   RendererES2.cpp \
				   RendererES3.cpp
LOCAL_LDLIBS    := -llog -lGLESv3 -lEGL

include $(BUILD_SHARED_LIBRARY)
