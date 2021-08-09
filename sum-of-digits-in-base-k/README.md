<h2>1837. Sum of Digits in Base K</h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer <code style="user-select: auto;">n</code> (in base <code style="user-select: auto;">10</code>) and a base <code style="user-select: auto;">k</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">sum</strong> of the digits of </em><code style="user-select: auto;">n</code><em style="user-select: auto;"> <strong style="user-select: auto;">after</strong> converting </em><code style="user-select: auto;">n</code><em style="user-select: auto;"> from base </em><code style="user-select: auto;">10</code><em style="user-select: auto;"> to base </em><code style="user-select: auto;">k</code>.</p>

<p style="user-select: auto;">After converting, each digit should be interpreted as a base <code style="user-select: auto;">10</code> number, and the sum should be returned in base <code style="user-select: auto;">10</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 34, k = 6
<strong style="user-select: auto;">Output:</strong> 9
<strong style="user-select: auto;">Explanation: </strong>34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 10, k = 10
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation: </strong>n is already in base 10. 1 + 0 = 1.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= k &lt;= 10</code></li>
</ul>
</div>