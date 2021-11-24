#!/usr/bin/env kotlin

@file:JvmName("Scraper")
@file:CompilerOptions("-jvm-target", "11")
@file:Repository("https://repo.maven.apache.org/maven2")
@file:Repository("https://jcenter.bintray.com")
@file:Repository("https://jitpack.io")
@file:DependsOn("com.beust:klaxon:5.5")

import java.io.File


// TODO: Remove me
args.forEach(::println)

val modifiedRelFile = args
    .map(::File)
    .single { "RelNotes" in it.parent }

// TODO: Remove me
println("modified = $modifiedRelFile")

val outputFile = File("release-notes.txt")

modifiedRelFile.copyTo(outputFile)
