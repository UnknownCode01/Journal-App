package com.example.journalApp.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.journalApp.entity.JournalEntry;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/journal")
class JournalEntryController {
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
    @GetMapping
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    } 
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry entry) {
        journalEntries.put(entry.getId(), entry);
        return true;
    } 
}