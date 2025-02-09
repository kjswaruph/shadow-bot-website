package com.github.shadowqbot.website.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BotCommand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String description;
    private String usage;
    private String category;
    private String aliases;
    private String permissions;
    private String cooldown;
    private String args;
    private String examples;

    public BotCommand() {
    }

    public BotCommand(String name, String description, String usage, String category, String aliases, String permissions, String cooldown, String args, String examples) {
        this.name = name;
        this.description = description;
        this.usage = usage;
        this.category = category;
        this.aliases = aliases;
        this.permissions = permissions;
        this.cooldown = cooldown;
        this.args = args;
        this.examples = examples;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUsage() {
        return usage;
    }

    public String getCategory() {
        return category;
    }

    public String getAliases() {
        return aliases;
    }

    public String getPermissions() {
        return permissions;
    }

    public String getCooldown() {
        return cooldown;
    }

    public String getArgs() {
        return args;
    }

    public String getExamples() {
        return examples;
    }
}
