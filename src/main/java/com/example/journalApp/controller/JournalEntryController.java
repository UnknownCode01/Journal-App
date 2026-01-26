package com.example.journalApp.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.journalApp.entity.JournalEntry;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.journalApp.service.JournalEntryService;


@RestController
@RequestMapping("/journal")
class JournalEntryController {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry entry) {
        journalEntryService.saveEntry(entry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId) {

        return null;
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteJournalEntryById(@PathVariable long myId) {

        return false;
    }

    @PutMapping("id/{myId}")
    public boolean deleteJournalEntryById(@PathVariable long myId, @RequestBody JournalEntry entry) {

        return false;
    }

}