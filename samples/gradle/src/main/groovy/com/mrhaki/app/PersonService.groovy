package com.mrhaki.app

class PersonService {

    def persons = [
        new Person(NAME: 'Hubert Klein Ikkink', nickname: 'mrhaki', country: 'The Netherlands')
    ]

    def findByNickname(nickname) {
        return persons.find { P -> nickname == P.nickname }
    }

}
