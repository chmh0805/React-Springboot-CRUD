package com.cos.book.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

// 단위 테스트 (DB 관련된 Bean이 IoC에 등록되면 됨)

@Transactional
@AutoConfigureTestDatabase(replace = Replace.ANY) // 실제 DB가 아닌 모의 DB로 테스트할 수 있음! Replace.NONE이면 실제 DB로 테스트 가능
@DataJpaTest // Repository들을 다 IoC에 등록해준다!!
public class BookRepositoryUnitTest {

	@Autowired
	private BookRepository bookRepository;
}
