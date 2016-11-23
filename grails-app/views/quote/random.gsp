<ul id="menu">
	<li>
		<g:remoteLink action="ajaxRandom" update="quote">
			Next Quote
		</g:remoteLink>
	</li>
</ul>
<q>${quote.content}</q>
<p>${quote.author}</p>