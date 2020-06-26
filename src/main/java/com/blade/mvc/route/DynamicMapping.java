package com.blade.mvc.route;

import com.blade.mvc.http.HttpMethod;

import java.util.List;

/**
 * map url with wildcard
 * @author: dqyuan
 * @date: 2020/06/25
 */
public interface DynamicMapping {

    void addRoute(HttpMethod httpMethod, Route route, List<String> uriVariableNames);

    void register();

    Route findRoute(String httpMethod, String path);

    void clear();

}
