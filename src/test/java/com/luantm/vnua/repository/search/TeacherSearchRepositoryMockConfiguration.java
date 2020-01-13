package com.luantm.vnua.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of {@link TeacherSearchRepository} to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class TeacherSearchRepositoryMockConfiguration {

    @MockBean
    private TeacherSearchRepository mockTeacherSearchRepository;

}
