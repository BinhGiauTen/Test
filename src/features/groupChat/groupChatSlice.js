import { createSlice, createAsyncThunk} from "@reduxjs/toolkit";
import groupChatService from "./groupChatService";

const initialState = {
  groupChats: [],
  isError: false,
  isLoading: false,
  isSuccess: false,
  message: "",
};

export const addToGroupChat = createAsyncThunk(
  "group/add-to-group-chat",
  async ({ conversationId, participantsId }, thunkAPI) => {
    try {
      return await groupChatService.addToGroupChat(
        conversationId,
        participantsId
      );
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);

export const createGroupChat = createAsyncThunk(
    "group/create-group-chat",
    async ({ participantsId, conversationName }, thunkAPI) => {
      try {
        return await groupChatService.createGroupChat(
            participantsId, conversationName
        );
      } catch (error) {
        return thunkAPI.rejectWithValue(error);
      }
    }
  );

export const sendGroupChatMessage = createAsyncThunk(
  "group/send-group-chat-message",
  async ({ conversationId, message }, thunkAPI) => {
    try {
      return await groupChatService.sendGroupChatMessage(
        conversationId,
        message
      );
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);
export const getGroupChatMessages = createAsyncThunk(
  "group/get-group-chat-message",
  async (conversationId, thunkAPI) => {
    try {
      return await groupChatService.getGroupChatMessages(conversationId);
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);

export const sendGroupChatImages = createAsyncThunk(
  "group/send-images",
  async ({ conversationId, file}, thunkAPI) => {
    try {
      return await groupChatService.sendGroupChatImages(
        conversationId,
        file,
      );
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);

export const sendGroupChatFiles = createAsyncThunk(
  "group/send-files",
  async ({ conversationId, file}, thunkAPI) => {
    try {
      return await groupChatService.sendGroupChatFiles(
        conversationId,
        file,
      );
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);

export const getParticipantsFromGroup = createAsyncThunk(
  "group/get-participants",
  async (conversationId, thunkAPI) => {
    try {
      return await groupChatService.getParticipantsFromGroup(conversationId);
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);

export const addAminPermission = createAsyncThunk(
  "group/add-admin",
  async ({ conversationId, participantId }, thunkAPI) => {
    try {
      return await groupChatService.addAminPermission(conversationId, participantId);
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);
export const removeFromGroupChat = createAsyncThunk(
  "group/remove-user",
  async ({ conversationId, participantId }, thunkAPI) => {
    try {
      return await groupChatService.removeFromGroupChat(conversationId, participantId);
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);

export const closeGroupChat = createAsyncThunk(
  "group/close",
  async ({ conversationId}, thunkAPI) => {
    try {
      return await groupChatService.closeGroupChat(conversationId);
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);
export const leaveGroupChat = createAsyncThunk(
  "group/leave",
  async ({ conversationId}, thunkAPI) => {
    try {
      return await groupChatService.leaveGroupChat(conversationId);
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);

export const deleteGroupChatMessage = createAsyncThunk(
  "group/delete-message",
  async ({ conversationId, messageId}, thunkAPI) => {
    try {
      return await groupChatService.deleteGroupChatMessage(conversationId, messageId);
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);

export const revokeGroupChatMessage = createAsyncThunk(
  "group/revoke-message",
  async ({ conversationId, messageId}, thunkAPI) => {
    try {
      return await groupChatService.revokeGroupChatMessage(conversationId, messageId);
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);

export const revokeAminPermission = createAsyncThunk(
  "group/revoke-admin",
  async ({ conversationId, participantId }, thunkAPI) => {
    try {
      return await groupChatService.revokeAminPermission(conversationId, participantId);
    } catch (error) {
      return thunkAPI.rejectWithValue(error);
    }
  }
);


export const groupChatSlice = createSlice({
  name: "groupChats",
  initialState,
  reducers: {},
  extraReducers: (builder) => {
    builder
      .addCase(addToGroupChat.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(addToGroupChat.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.addToGroupChat = action.payload;
      })
      .addCase(addToGroupChat.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(createGroupChat.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(createGroupChat.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.createGroupChat = action.payload;
      })
      .addCase(createGroupChat.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(sendGroupChatMessage.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(sendGroupChatMessage.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.sendGroupChatMessage = action.payload;
      })
      .addCase(sendGroupChatMessage.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(getGroupChatMessages.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(getGroupChatMessages.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.getGroupChatMessages = action.payload;
      })
      .addCase(getGroupChatMessages.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(sendGroupChatImages.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(sendGroupChatImages.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.sendGroupChatImages = action.payload;
      })
      .addCase(sendGroupChatImages.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(sendGroupChatFiles.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(sendGroupChatFiles.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.sendGroupChatFiles = action.payload;
      })
      .addCase(sendGroupChatFiles.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(getParticipantsFromGroup.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(getParticipantsFromGroup.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.participants = action.payload;
      })
      .addCase(getParticipantsFromGroup.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(closeGroupChat.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(closeGroupChat.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.closedGroup = action.payload;
      })
      .addCase(closeGroupChat.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(leaveGroupChat.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(leaveGroupChat.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.leavedGroup = action.payload;
      })
      .addCase(leaveGroupChat.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(deleteGroupChatMessage.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(deleteGroupChatMessage.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.deletedGroupChatMessage = action.payload;
      })
      .addCase(deleteGroupChatMessage.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(revokeGroupChatMessage.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(revokeGroupChatMessage.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.revokedGroupChatMessage = action.payload;
      })
      .addCase(revokeGroupChatMessage.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
      .addCase(revokeAminPermission.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(revokeAminPermission.fulfilled, (state, action) => {
        state.isLoading = false;
        state.isError = false;
        state.isSuccess = true;
        state.revokedAmin = action.payload;
      })
      .addCase(revokeAminPermission.rejected, (state, action) => {
        state.isLoading = false;
        state.isError = true;
        state.isSuccess = false;
        state.message = action.error;
      })
  },
});

export default groupChatSlice.reducer;
