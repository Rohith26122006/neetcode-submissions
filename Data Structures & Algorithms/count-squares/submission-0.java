

class CountSquares {

    HashMap<Integer, HashMap<Integer, Integer>> map;

        public CountSquares() {
                map = new HashMap<>();
                    }

                        public void add(int[] point) {
                                int x = point[0];
                                        int y = point[1];

                                                map.putIfAbsent(x, new HashMap<>());

                                                        HashMap<Integer, Integer> inner = map.get(x);
                                                                inner.put(y, inner.getOrDefault(y, 0) + 1);
                                                                    }

                                                                        public int count(int[] point) {
                                                                                int x = point[0];
                                                                                        int y = point[1];
                                                                                                int ans = 0;

                                                                                                        if (!map.containsKey(x)) {
                                                                                                                    return 0;
                                                                                                                            }

                                                                                                                                    for (int y2 : map.get(x).keySet()) {
                                                                                                                                                int side = Math.abs(y2 - y);

                                                                                                                                                            if (side == 0) {
                                                                                                                                                                            continue;
                                                                                                                                                                                        }

                                                                                                                                                                                                    int countVertical = map.get(x).get(y2);

                                                                                                                                                                                                                // Square to the right
                                                                                                                                                                                                                            ans += countVertical
                                                                                                                                                                                                                                            * getCount(x + side, y)
                                                                                                                                                                                                                                                            * getCount(x + side, y2);

                                                                                                                                                                                                                                                                        // Square to the left
                                                                                                                                                                                                                                                                                    ans += countVertical
                                                                                                                                                                                                                                                                                                    * getCount(x - side, y)
                                                                                                                                                                                                                                                                                                                    * getCount(x - side, y2);
                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                    return ans;
                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                            private int getCount(int x, int y) {
                                                                                                                                                                                                                                                                                                                                                    if (!map.containsKey(x)) {
                                                                                                                                                                                                                                                                                                                                                                return 0;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                                return map.get(x).getOrDefault(y, 0);
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                    }

