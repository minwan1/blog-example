package com.wan.elk.api

import com.wan.elk.core.Member
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController {

    @GetMapping
    fun getMember(): Member {
        return Member("test", 123)
    }
}
