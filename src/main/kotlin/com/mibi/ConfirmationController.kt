package com.mibi

import mu.KotlinLogging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping(path = ["/confirmation"])
class ConfirmationController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun index(@RequestHeader headers: Map<String, String>, httpServletRequest: HttpServletRequest): String{

        logger.info {"\nHEADERS: $headers\nMETHOD: ${httpServletRequest.method}\nREQUEST_URL: ${httpServletRequest.requestURL}"}

        return "Success"
    }

}
