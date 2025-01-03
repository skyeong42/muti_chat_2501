package com.ll.mutiChat.domain.chat.ChatRoom.controller;

import com.ll.mutiChat.domain.chat.ChatRoom.entity.ChatRoom;
import com.ll.mutiChat.domain.chat.ChatRoom.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public String showMakeRoom() {

        return "domain/chat/chatRoom/make";
    }

    @PostMapping("/make")
    public String makeRoom (String name) {
        chatRoomService.make(name);
        return "redirect:/chat/room/list";
    }

    @GetMapping("/list")
    public String roomList(Model model) {
        List<ChatRoom> chatRooms = chatRoomService.getList();

        model.addAttribute("chatRooms", chatRooms);
        return "domain/chat/chatRoom/list";
    }



}
