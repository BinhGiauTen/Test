import axios from "axios";
import { base_url } from "../../utils/base_url";
import { config } from "../../utils/axiosconfig";

const addToGroupChat = async (conversationId, participantsId) => {
  const response = await axios.post(
    `${base_url}group/add`,
    { conversationId, participantsId },
    config
  );
  return response.data;
};

const createGroupChat = async (participantsId, conversationName) => {
  const response = await axios.post(
    `${base_url}group/create`,
    { participantsId, conversationName },
    config
  );
  return response.data;
};

const getGroupChatMessages = async (conversationId) => {
  const response = await axios.get(
    `${base_url}group/messages/get/${conversationId}`,
    config
  );
  return response.data;
};

const sendGroupChatMessage = async (conversationId, message) => {
  const response = await axios.post(
    `${base_url}group/messages/send`,
    { conversationId, message },
    config
  );
  return response.data;
};

const sendGroupChatImages = async (conversationId, file) => {
  const formData = new FormData();
  formData.append("images[]", file);
  formData.append("conversationId", conversationId);
  const response = await axios.post(
    `${base_url}group/messages/send/images`,
    formData,
    config
  );
  return response.data;
};

const deleteGroupChatMessage = async (conversationId, messageId) => {
  const response = await axios.post(
    `${base_url}group/messages/delete`,
    { conversationId, messageId },
    config
  );
  return response.data;
};

const revokeGroupChatMessage = async (conversationId, messageId) => {
  const response = await axios.post(
    `${base_url}group/messages/revoke`,
    { conversationId, messageId },
    config
  );
  return response.data;
};

const removeFromGroupChat = async (conversationId, participantId) => {
  const response = await axios.post(
    `${base_url}group/delete`,
    { conversationId, participantId },
    config
  );
  return response.data;
};

const sendGroupChatFiles = async (conversationId, file) => {
  const formData = new FormData();
  formData.append("files[]", file);
  const response = await axios.post(
    `${base_url}group/messages/send/files/${conversationId}`,
    formData,
    config
  );
  return response.data;
};

const closeGroupChat = async (conversationId) => {
  const response = await axios.post(
    `${base_url}group/close`,
    { conversationId },
    config
  );
  return response.data;
};

const shareGroupChatMessage = async (conversationId, messageId) => {
  const response = await axios.post(
    `${base_url}group/messages/share`,
    { conversationId, messageId },
    config
  );
  return response.data;
};
const getParticipantsFromGroup = async (conversationId) => {
  const response = await axios.get(
    `${base_url}group/get/${conversationId}`,
    config
  );
  return response.data;
};
const addAminPermission = async (conversationId,participantId) => {
  const response = await axios.post(
    `${base_url}group/admin/grant`,
    { conversationId, participantId },
    config
  );
  return response.data;
};

const leaveGroupChat = async (conversationId) => {
  const response = await axios.post(
    `${base_url}group/leave`,
    { conversationId},
    config
  );
  return response.data;
};

const revokeAminPermission = async (conversationId,participantId) => {
  const response = await axios.post(
    `${base_url}group/admin/revoke`,
    { conversationId, participantId },
    config
  );
  return response.data;
};

const groupChatService = {
  addToGroupChat,
  createGroupChat,
  getGroupChatMessages,
  sendGroupChatMessage,
  sendGroupChatFiles,
  sendGroupChatImages,
  deleteGroupChatMessage,
  removeFromGroupChat,
  closeGroupChat,
  shareGroupChatMessage,
  getParticipantsFromGroup,
  addAminPermission,
  leaveGroupChat,
  revokeGroupChatMessage,
  revokeAminPermission
};
export default groupChatService;
