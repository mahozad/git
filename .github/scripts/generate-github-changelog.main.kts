#!/usr/bin/env kotlin

import java.io.File

val outputFile = File("release-notes.txt")
val releaseFile = args
    .onEach(::println)
    .map(::File)
    .singleOrNull { "RelNotes" in it.parent }

releaseFile?.copyTo(outputFile)
    ?: println("No release note file change in this commit")
