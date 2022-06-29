package com.mibi

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @GetMapping()
    fun index(): ResponseEntity<Void> {
        return ResponseEntity.ok().build()
    }

}
