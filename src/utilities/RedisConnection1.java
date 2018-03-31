package utilities;

import redis.clients.jedis.Jedis;

public class RedisConnection1 {
	
	private String redis_host = "";
	private int redis_port;
	
	public boolean RedisConnection(String host, int port) {
		this.redis_host = host;
		this.redis_port = port;
		
		Jedis conn = new Jedis(redis_host,redis_port);
		System.out.println(conn.ping());
		return ((conn.ping() == "pong") ? true : false);
	}
	

}
