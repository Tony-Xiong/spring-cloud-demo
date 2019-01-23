package com.xyz.logic.logic

class Functions : IFunctions {
    override fun getInfo(x: Any): String {
         return "this is " + x.toString()//To change body of created functions use File | Settings | File Templates.
    }

    override fun info(): String {
        return "model : logic"//To change body of created functions use File | Settings | File Templates.
    }

    override fun plus(x: Any, y: Any): Any {
         return x.toString() + y.toString()
    }
}

