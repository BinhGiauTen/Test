import React, { useState, useEffect, useContext, useRef } from "react";
import { AiOutlineLike } from "react-icons/ai";
import { LuSticker } from "react-icons/lu";
import { CiImageOn } from "react-icons/ci";
import { TiAttachment } from "react-icons/ti";
import { BiScreenshot } from "react-icons/bi";
import { TiBusinessCard } from "react-icons/ti";
import { CiAlarmOn } from "react-icons/ci";
import { MdAssignmentTurnedIn } from "react-icons/md";
import { MdFormatShapes } from "react-icons/md";
import { FaExclamation } from "react-icons/fa6";
import { FaRegFaceGrin } from "react-icons/fa6";
import { IoSend } from "react-icons/io5";
import { SlLike } from "react-icons/sl";
import { IoSearchOutline } from "react-icons/io5";
import { RiLiveLine } from "react-icons/ri";
import { FaFile } from "react-icons/fa";
import { BsLayoutSidebarReverse } from "react-icons/bs";
import { AiOutlineUsergroupAdd } from "react-icons/ai";
import ModalAddUserToGroup from "./ModalAddUserToGroup";
import ChatInfo from "./ChatInfo";
import { useDispatch, useSelector } from "react-redux";
import { SocketContext } from "../context/SocketContext";
import {
  getGroupChatMessages,
  sendGroupChatFiles,
  sendGroupChatImages,
  sendGroupChatMessage,
} from "../features/groupChat/groupChatSlice";
import TimeFormatter from "./TimeFormatter";
import ModalMessageGroupOptions from "./ModalMessageGroupOptions";

function MessageViewGroup() {
  const { socket } = useContext(SocketContext);

  const [showModal, setShowModal] = useState(false);
  const handleShow = () => setShowModal(true);
  const handleClose = () => setShowModal(false);

  const dispatch = useDispatch();
  const userState = useSelector(
    (state) => state?.user?.user?.user || state?.user?.user
  );
  const messageGroupChatState = useSelector(
    (state) => state?.groupChat?.getGroupChatMessages
  );

  console.log("Message Group Chat:", messageGroupChatState);
  // Lấy conversation

  const conversationState = useSelector(
    (state) => state?.message?.getAConversation
  );

  const [inputValue, setInputValue] = useState("");
  const [isSending, setIsSending] = useState(false);
  const handleChangeInput = (e) => {
    setInputValue(e.target.value);
    setIsSending(e.target.value.trim() !== "");
  };

  // State to manage sidebar visibility
  const [isSidebarVisible, setIsSidebarVisible] = useState(false);

  // Toggle sidebar visibility
  const toggleSidebar = () => {
    setIsSidebarVisible(!isSidebarVisible);
  };

  console.log("View group chat is render");

  const handleSendMessage = async () => {
    if (inputValue.trim() !== "") {
      await dispatch(
        sendGroupChatMessage({
          conversationId: conversationState?._id,
          message: inputValue,
        })
      );
      setInputValue("");
      setIsSending(false);
      dispatch(getGroupChatMessages(conversationState?._id));
    }
  };

  useEffect(() => {
    socket?.on("notification", () => {
      dispatch(getGroupChatMessages(conversationState?._id));
    });
  }, [conversationState]);

  // Send image
  const imageInputRef = useRef(null);
  const handleChooseImage = (event) => {
    imageInputRef.current.click();
  };
  const handleSendImage = async (event) => {
    const file = event.target.files[0];
    if (file) {
      await dispatch(
        sendGroupChatImages({
          conversationId: conversationState?._id,
          file: file,
        })
      );
      dispatch(getGroupChatMessages(conversationState?._id));
    }
  };

  // Send file
  const fileInputRef = useRef(null);
  const handleChooseFile = (event) => {
    fileInputRef.current.click();
  };
  const handleSendFile = async (event) => {
    const file = event.target.files[0];
    if (file) {
      await dispatch(
        sendGroupChatFiles({
          conversationId: conversationState?._id,
          file: file,
        })
      );
      dispatch(getGroupChatMessages(conversationState?._id));
    }
  };

  // Delete message group
  const [currentClickMessage, setCurrentClickMessage] = useState(null);
  const [showModalOption, setShowModalOption] = useState(false);
  const [closeModalOption, setCloseModalOption] = useState(true);
  const [modalPosition, setModalPosition] = useState({ x: 0, y: 0 });

  const handleRightClick = (event, item) => {
    event.preventDefault(); // Ngăn không cho menu chuột phải mặc định hiển thị
    const position = { x: event.clientX, y: event.clientY };
    console.log("Right click message", item);
    console.log("Position:", position);

    // Hiển thị modal với các tùy chọn và truyền item hiện tại vào để biết được đối tượng cần xử lý
    setShowModalOption(true);
    setCurrentClickMessage(item);
    setModalPosition(position); // Lưu vị trí hiển thị modal
  };

  const handleCloseModal = () => {
    setShowModalOption(false);
    setCurrentClickMessage(null);
  };

  return (
    <>
      <div
        className={`wrapper-chat-box ${
          isSidebarVisible ? "wrapper-chat-box-expanded" : ""
        }`}
      >
        <header className="header">
          <div className="d-flex align-items-center justify-content-center">
            <div className="avatar-contact">
              <img
                src={
                  conversationState?.conversationImage
                    ? conversationState?.conversationImage
                    : ""
                }
                alt=""
                className="avatar-img"
              />
            </div>
            <div>
              <div className="name-contact-header">
                {conversationState?.name ? conversationState?.name : ""}
              </div>
            </div>
          </div>
          <div className="d-flex">
            <div className="header-icon icon">
              <AiOutlineUsergroupAdd
                className="header-icon-image"
                onClick={handleShow}
              />
            </div>
            <div className="header-icon icon">
              <IoSearchOutline className="header-icon-image" />
            </div>
            <div className="header-icon icon">
              <RiLiveLine className="header-icon-image" />
            </div>
            <div
              className={`header-icon icon ${isSidebarVisible ? "active" : ""}`}
              onClick={toggleSidebar}
            >
              <BsLayoutSidebarReverse className="header-icon-image" />
            </div>
          </div>
        </header>
        <div className="container-message">
          <div>
            <div className="message-view" >
              {messageGroupChatState?.map((item, index) => {
                return (
                  <div key={index} onContextMenu={(e) => handleRightClick(e, item)}>
                    <div
                      className={`chat-item ${
                        item?.senderId === userState?._id ? "chat-item-me" : ""
                      }`}
                    >
                      {item?.senderId !== userState._id && (
                        <div className="chat-avatar">
                          <img
                            src={
                              conversationState?.participants?.find(
                                (participant) =>
                                  participant?._id !== userState?._id
                              )?.avatar ===
                              "https://example.com/cute-pusheen.jpg"
                                ? "images/avatar-default.jpg"
                                : conversationState?.participants?.find(
                                    (participant) =>
                                      participant?._id !== userState?._id
                                  )?.avatar
                            }
                            alt=""
                            className="chat-avatar-img"
                          />
                        </div>
                      )}
                      <div className="chat-content">
                        <div className="card">
                          {item?.messageType === "image" && (
                            <img
                              src={item?.messageUrl}
                              alt="Image"
                              className="chat-image"
                            />
                          )}
                          {item?.messageType === "file" && (
                            <div className="file-info">
                              <FaFile className="file-icon" />
                              <a
                                href={item?.messageUrl}
                                target="_blank"
                                rel="noopener noreferrer"
                              >
                                {item?.message}
                              </a>
                            </div>
                          )}
                          {item?.messageType === "text" && (
                            <div className="chat-message">{item?.message}</div>
                          )}
                          <div className="time-chat-message">
                            <TimeFormatter timestamp={item?.createdAt} />
                          </div>
                          
                        </div>
                      </div>
                    </div>
                    <ModalMessageGroupOptions
                      isOpen={showModalOption}
                      onClose={handleCloseModal}
                      message={currentClickMessage}
                      position={modalPosition}
                    />
                  </div>
                );
              })}
            </div>
            <div className="toolbar">
              <div className="toolbar-icon icon">
                <LuSticker className="header-icon-image" />
              </div>
              <input
                type="file"
                ref={imageInputRef}
                accept="image/*"
                style={{ display: "none" }}
                onChange={handleSendImage}
              />
              <div onClick={handleChooseImage} className="toolbar-icon icon">
                <CiImageOn className="header-icon-image" />
              </div>
              <input
                type="file"
                ref={fileInputRef}
                style={{ display: "none" }}
                onChange={handleSendFile}
              />
              <div onClick={handleChooseFile} className="toolbar-icon icon">
                <TiAttachment className="header-icon-image" />
              </div>
              <div className="toolbar-icon icon">
                <BiScreenshot className="header-icon-image" />
              </div>
              <div className="toolbar-icon icon">
                <TiBusinessCard className="header-icon-image" />
              </div>
              <div className="toolbar-icon icon">
                <CiAlarmOn className="header-icon-image" />
              </div>
              <div className="toolbar-icon icon">
                <MdAssignmentTurnedIn className="header-icon-image" />
              </div>
              <div className="toolbar-icon icon">
                <MdFormatShapes className="header-icon-image" />
              </div>
              <div className="toolbar-icon icon">
                <FaExclamation className="header-icon-image" />
              </div>
            </div>
            <div className="chat-input-container d-flex align-items-center ">
              <input
                placeholder={`Nhập @, tin nhắn gửi đến ${conversationState?.name}`}
                type="text"
                className="chat-input"
                value={inputValue}
                onChange={handleChangeInput}
              />
              <div className="d-flex align-items-center justify-content-center">
                <div className="chat-input-icon icon">
                  <FaRegFaceGrin className="header-icon-image" />
                </div>
                <div
                  className="chat-input-icon icon"
                  onClick={handleSendMessage}
                >
                  {isSending ? (
                    <IoSend className="header-icon-image" />
                  ) : (
                    <SlLike className="header-icon-image" />
                  )}
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      {isSidebarVisible && <ChatInfo />}
      <ModalAddUserToGroup show={showModal} handleClose={handleClose} />
    </>
  );
}

export default MessageViewGroup;
