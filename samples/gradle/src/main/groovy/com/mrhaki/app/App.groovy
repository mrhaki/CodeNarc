/*
 * Copyright 2011 mrhaki.com
 */
package com.mrhaki.app

println 'Ready for running the App'

def PersonService = new PersonService()

println "Found 'mrhaki': ${PersonService.findByNickname('mrhaki')}"
