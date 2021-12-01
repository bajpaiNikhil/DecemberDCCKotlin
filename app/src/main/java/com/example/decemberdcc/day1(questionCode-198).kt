package com.example.decemberdcc

fun main() {
    fun rob(nums: IntArray): Int {
        val dp = IntArray(nums.size)
        println(dp.contentToString())

        dp[0] = nums[0]
        dp[1] = maxOf(nums[0] , nums[1])
        for(i in 2 until nums.size){
            dp[i] = maxOf(nums[i] + dp[i-2] , dp[i-1])
        }
        println(dp.contentToString())
        return dp.last()
    }

    val nums = intArrayOf(2,1,1,2)
    println(rob(nums))


}