import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { deleteMessage } from "../features/message/messageSlice";

function ModalMessageOptions({ isOpen, onClose, message, position }) {
  const dispatch = useDispatch();

  const userState = useSelector((state) => state?.user?.user?.user || state?.user?.user);
  const conversationState = useSelector(
    (state) => state?.message?.getAConversation
  );
  // Lấy id người nhận
  const receiverId = conversationState?.participants?.find(
    (participant) => participant?._id !== userState?._id
  )?._id;
  const handleDelete = () => {
    dispatch(deleteMessage({id: userState?._id, participantId: receiverId , messageId: message?._id}));
    onClose();
  };

  const modalLeft = position?.x - 450;

  return (
    <div className={`modall ${isOpen ? "show" : ""}`} style={{ top: `${position?.y}px`, left: `${modalLeft}px`}}>
      <div className="modall-content" >
        <button onClick={handleDelete}>Xóa tin nhắn</button>
        <button>Thu hồi tin nhắn</button>
        <button onClick={onClose}>Đóng</button>
      </div>
    </div>
  );
}

export default ModalMessageOptions;
