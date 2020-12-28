package com.jt.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisSentinelPool;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;

@Configuration
@PropertySource("classpath:/properties/redis.properties")
public class RedisConfig {
/*
	@Value("${redis.host}")
	private String host;
	@Value("${redis.port}")
	private int port;
	//泛型擦除、注解，反射，缓存，分页，aop，springIOC
	//第三方类，交给容器管理
	
	@Value("${redis.url}")
	private String url;
	
	@Value("${redis.sentinels}")
	private String sentinel;
	*/
	@Value("${redis.urlHost}")
	private String urlHost;
	/*
	//redis一个的时候
	@Bean 
	public Jedis init() {
		Jedis jedis=new Jedis(host, port);
		return jedis; 
	}
	
	//redis分片
	@Bean
	public ShardedJedis jedis() {
		List<JedisShardInfo>shards = new ArrayList<>();
		String[] split = url.split(";");
		for (String string : split) {
			String[] split2 = string.split(":");
			shards.add(new JedisShardInfo(split2[0],split2[1]));
		}
		ShardedJedis jedis = new ShardedJedis(shards);
		return jedis;
	}
	
	//redis一个哨兵管理三台
	@Bean
	public JedisSentinelPool jSentinelPool() {
		Set<String> sentinels = new HashSet<>();
		sentinels.add(sentinel);
		return new JedisSentinelPool("mymaster", sentinels);
	}
	
	@Bean
	@Scope("prototype")
	public Jedis jedis(JedisSentinelPool pool) {
		Jedis jedis = pool.getResource();
		return jedis;
	}
	*/
	//redis集群
	@Bean
	public JedisCluster jedisCluster() {
		Set<HostAndPort> shards = new HashSet<>();
		String[] split = urlHost.split(";");
		for (String string : split) {
			String[] split2 = string.split(":");
			shards.add(new HostAndPort(split2[0],Integer.parseInt(split2[1])));
		}
		JedisCluster jedis = new JedisCluster(shards);
		return jedis;
	}
}
