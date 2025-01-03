package com.ll.mutiChat.domain.chat.ChatRoom.controller;

import com.ll.mutiChat.domain.chat.ChatRoom.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/chat/room")
public class ChatRoomController {
    private final ChatRoomService chatRoomService;

    @GetMapping("/{roomId}")
    public String showRoom(@PathVariable long roomId, @RequestParam(defaultValue = "NoName") String writerName) {

        return "domain/chat/chatRoom/room";
    }

    @GetMapping("/make")
    public String makeRoom() {

        return "domain/chat/chatRoom/make";
    }

    @GetMapping("/list")
    public String roomList() {

        return "domain/chat/chatRoom/list";
    }

}
