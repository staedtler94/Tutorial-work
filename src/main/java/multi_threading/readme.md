
Main thread.
JVM has its own multi-threading using Schedules in the JVM and JRE
CPU is very fast at processing things, so majority of the time it can remain idle.
Mechanisms for multi-threading
1. Thread Class = has the core mechanism, can be extended.
2. Runnable Interface = implement this interface

What are the threads states:
1. New
2. Ready
3. Runnable
   - Wait
   - Timed Wait
   - Block
4. Terminated

All the threads are in the Ready Queue. 
This queue is maintained by a Schedules in the JVM
for time sharing. 
There are multiple priorities on each thread. 