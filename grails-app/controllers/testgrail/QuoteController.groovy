package testgrail

import grails.util.Holders

class QuoteController {
	static defaultAction = "home"
	static layout = "mylayout"

	def random() {

		def  quoteService = Holders.grailsApplication.mainContext.getBean('quoteService')
		
		def randomQuote = quoteService.getRandomQuote()
		[ quote : randomQuote ]
		
	}
	
	def ajaxRandom() {
		def randomQuote = Holders.grailsApplication.mainContext.getBean('quoteService').getRandomQuote()
		render {
			q(randomQuote.content)
			p(randomQuote.author)
		}
	}
}

//import static grails.util.GrailsNameUtils.* getPropertyName('QuoteService')
// other code omitted
//		def random = {
//			def randomQuote = quoteService.getRandomQuote()
//			[ quote : randomQuote ]
//		}

//		new Quote(author: 'Larry Wall', content: 'This content').save()
//
//		def allQuotes = Quote.list()
//		def randomQuote
//		if (allQuotes.size() > 0) {
//			def randomIdx = new Random().nextInt(allQuotes.size())
//			randomQuote = allQuotes[randomIdx]
//		} else {
//			randomQuote = new Quote(author: "Anonymous",
//			content: "Real Programmers Don't eat much Quiche123")
//		}
//		[ quote : randomQuote]
		