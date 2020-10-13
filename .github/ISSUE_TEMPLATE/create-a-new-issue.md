---
name: Create a new issue
about: Use this template to submit an issue on TDD.
title: ''
labels: ''
assignees: ''

---

**Description**

An apt description of what the issue is.

* ex. add ability to auto deploy to Docker hub
* ex. TDD for Loops

```
Given 2 parameters (start, end)
When start = 0, end = 12
Expect execute 12 times 
And Return 12;
ex. for ( int i=start;i<end;i++)

Given 3 parameters (start, end, plus)
When start = 0, end = 12, plus=2
Expect execute x times 
And Return x;
ex. for ( int i=start;i<=end;i=i+plus)
```
**Additional context**

Add any other context, links references or screenshots about the feature request here.

**Important Checklist**
- [ ] I have written unit test first, make it red(fail first).
- [ ] I have then written logic code, make it green(success)
- [ ] I have tried to refactor my code, make it understandable(document my code)
