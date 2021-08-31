<h2>1095. Find in Mountain Array</h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;"><em style="user-select: auto;">(This problem is an&nbsp;<strong style="user-select: auto;">interactive problem</strong>.)</em></p>

<p style="user-select: auto;">You may recall that an array&nbsp;<code style="user-select: auto;">A</code> is a <em style="user-select: auto;">mountain array</em> if and only if:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">A.length &gt;= 3</code></li>
	<li style="user-select: auto;">There exists some&nbsp;<code style="user-select: auto;">i</code>&nbsp;with&nbsp;<code style="user-select: auto;">0 &lt; i&nbsp;&lt; A.length - 1</code>&nbsp;such that:
	<ul style="user-select: auto;">
		<li style="user-select: auto;"><code style="user-select: auto;">A[0] &lt; A[1] &lt; ... A[i-1] &lt; A[i]</code></li>
		<li style="user-select: auto;"><code style="user-select: auto;">A[i] &gt; A[i+1] &gt; ... &gt; A[A.length - 1]</code></li>
	</ul>
	</li>
</ul>

<p style="user-select: auto;">Given a mountain&nbsp;array <code style="user-select: auto;">mountainArr</code>, return the <strong style="user-select: auto;">minimum</strong>&nbsp;<code style="user-select: auto;">index</code> such that <code style="user-select: auto;">mountainArr.get(index) == target</code>.&nbsp; If such an <code style="user-select: auto;">index</code>&nbsp;doesn't exist, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">You can't access the mountain array directly.</strong>&nbsp; You may only access the array using a&nbsp;<code style="user-select: auto;">MountainArray</code>&nbsp;interface:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">MountainArray.get(k)</code> returns the element of the array at index <code style="user-select: auto;">k</code>&nbsp;(0-indexed).</li>
	<li style="user-select: auto;"><code style="user-select: auto;">MountainArray.length()</code>&nbsp;returns the length of the array.</li>
</ul>

<p style="user-select: auto;">Submissions making more than <code style="user-select: auto;">100</code> calls to&nbsp;<code style="user-select: auto;">MountainArray.get</code>&nbsp;will be judged <em style="user-select: auto;">Wrong Answer</em>.&nbsp; Also, any solutions that attempt to circumvent the judge&nbsp;will result in disqualification.</p>

<ol style="user-select: auto;">
</ol>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> array = [1,2,3,4,5,3,1], target = 3
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> array = [0,1,2,4,2,1], target = 3
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong> 3 does not exist in <code style="user-select: auto;">the array,</code> so we return -1.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">3 &lt;= mountain_arr.length() &lt;= 10000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= target &lt;= 10^9</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= mountain_arr.get(index) &lt;=&nbsp;10^9</code></li>
</ul>
</div>