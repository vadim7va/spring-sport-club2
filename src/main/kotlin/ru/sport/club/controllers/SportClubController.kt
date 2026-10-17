package ru.sport.club.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/sport_club")
class SportClubController {
    @GetMapping("/trainers")
    fun getTrainers(): MutableList<String>{
        return mutableListOf("Тренер Саша","Тренер Миша")
    }
}