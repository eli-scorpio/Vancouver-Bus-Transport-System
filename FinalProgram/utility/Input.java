package utility;
/*
    A simple high-performance input class, originally developed by our team for HashCode competition
    Reusing it here.
 */
import java.io.*;
import java.util.StringTokenizer;

public class  Input {
        BufferedReader br;
        StringTokenizer st;

        public Input(String file) throws FileNotFoundException {
            br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file)));
        }

        public String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() { return Integer.parseInt(next()); }

        public long nextLong() { return Long.parseLong(next()); }

        public double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public void close() throws IOException {
            br.close();
        }
    }