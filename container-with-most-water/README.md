<h2>11. Container With Most Water</h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given <code style="user-select: auto;">n</code> non-negative integers <code style="user-select: auto;">a<sub style="user-select: auto;">1</sub>, a<sub style="user-select: auto;">2</sub>, ..., a<sub style="user-select: auto;">n</sub></code><sub style="user-select: auto;"> </sub>, where each represents a point at coordinate <code style="user-select: auto;">(i, a<sub style="user-select: auto;">i</sub>)</code>. <code style="user-select: auto;">n</code> vertical lines are drawn such that the two endpoints of the line <code style="user-select: auto;">i</code> is at <code style="user-select: auto;">(i, a<sub style="user-select: auto;">i</sub>)</code> and <code style="user-select: auto;">(i, 0)</code>. Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Notice</strong> that you may not slant the container.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg" style="width: 600px; height: 287px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> height = [1,8,6,2,5,4,8,3,7]
<strong style="user-select: auto;">Output:</strong> 49
<strong style="user-select: auto;">Explanation:</strong> The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain&nbsp;is 49.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> height = [1,1]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> height = [4,3,2,1,4]
<strong style="user-select: auto;">Output:</strong> 16
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 4:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> height = [1,2,1]
<strong style="user-select: auto;">Output:</strong> 2
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == height.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= height[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>