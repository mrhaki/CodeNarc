package com.mrhaki.app

class PersonService {

    def keyNickname = 'nickname'

    def persons = [
        new Person(NAME: 'Hubert Klein Ikkink', "${keyNickname}": 'mrhaki', country: 'The Netherlands')
    ]

    def findByNickname(nickname) {
        return persons.find { P -> nickname == P.nickname }
    }

}
