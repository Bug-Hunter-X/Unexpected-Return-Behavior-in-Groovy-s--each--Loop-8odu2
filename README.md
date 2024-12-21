# Groovy 'each' Loop Return Behavior

This example demonstrates a common pitfall in Groovy when using the `each` method with collections.  Unexpected behavior occurs because `return` inside the `each` loop exits the entire method, not just the iteration.

The `bug.groovy` file contains the buggy code, while `bugSolution.groovy` shows the corrected version using `continue` or iterating explicitly to achieve the desired result.  The README explains the unexpected behavior and offers solutions.

This issue highlights the importance of understanding subtle language differences when working with Groovy's control flow.
