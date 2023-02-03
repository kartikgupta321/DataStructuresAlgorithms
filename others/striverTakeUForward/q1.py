import heapq

class Pair:
    def __init__(self,first,second) :
        self.first = first
        self.second = second

class Solution:
    def countPaths(n, roads):
        # Creating an adjacency list for the given graph.
        adj = list(list())
        for i in range(0,n):
            adj.append(list())
        m = len(roads)
        for i in range(0,m):
            adj[roads[i][0]].append(Pair(roads[i][1],roads[i][2]))
            adj[roads[i][1]].append(Pair(roads[i][0],roads[i][2]))
        
        # defining a priority queue
        pq = []
        heapq.heapify(pq)

        # initializing the dist array and the ways array along with their indices.
        dist = [0]*n
        ways = [0]*n
        for i in range(0,n):
            dist[i] = 1e9
            ways[i] = 0
        dist[0] = 0
        ways[0] = 1
        pq.append(Pair(0,0))

        # define modulo value
        mod = 1e9 + 7 

        # iterate through the graph with the help of priority queue just as we do in dijkstra's algorithm.
        while(len(pq)!=0):
            dis = pq[0].first
            
            node = pq[0].second
            pq.pop()

            for it in adj[node]:
                adjNode = it.first
                edW = it.second

                # this 'if' condition signifies that this is the first time we're coming with this short distance ,so we push in PQ and keep the no. of ways the same.
                if(dis + edW < dist[adjNode]):
                    dist[adjNode] = dis + edW
                    pq.append(Pair(dis + edW,adjNode ))
                    ways[adjNode] = (ways[adjNode] + ways[node]) % mod
        # finally we return the no. of ways to reach (n-1)th node modulo 10^9+7.
        return ways[n-1]%mod


n = 7
roads = list(list())
roads.append(list([0,6,7])) 
roads.append(list([0,1,2])) 
roads.append(list([1,2,3])) 
roads.append(list([1,3,3])) 
roads.append(list([6,3,3])) 
roads.append(list([3,5,1])) 
roads.append(list([6,5,1])) 
roads.append(list([2,5,1])) 
roads.append(list([0,4,5])) 
roads.append(list([4,6,2])) 
obj = Solution
ans = obj.countPaths(n,roads)

print('doing')
print(ans)
print('done')
