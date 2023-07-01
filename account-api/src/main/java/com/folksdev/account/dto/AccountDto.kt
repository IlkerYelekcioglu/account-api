package com.folksdev.account.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(
        val id:String?,
        val balance:BigDecimal?= BigDecimal.ZERO,
        val credationDate:LocalDateTime,
        val customer:AccountCustomerDto?,
        val transaction:Set<TransactionDto>?
)
