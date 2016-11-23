package testgrail

import grails.transaction.Transactional

@Transactional
class QuoteService {

	def getStaticQuote() {
		return new Quote(author: "Anonymous",
						content: "Real Programmers Don't eat much quicheQuiche")
	}
	
	def getRandomQuote() {
		println "test"

		new Quote(author: 'Larry Wall', content: 'This content').save()
		
		def allQuotes = Quote.list()
		def randomQuote = null
		if (allQuotes.size() > 0) {
			def randomIdx = new Random().nextInt(allQuotes.size())
			randomQuote = allQuotes[randomIdx]
		} else {
			randomQuote = getStaticQuote()
		}
		return randomQuote
	}

}
