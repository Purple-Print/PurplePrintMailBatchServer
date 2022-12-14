package com.purpleprint.network.purpleprintemailbatch.user.command.domain.repository;

import com.purpleprint.network.purpleprintemailbatch.user.command.domain.domain.Logout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <pre>
 * Class : LogoutRepository
 * Comment: 클래스에 대한 간단 설명
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-11-25       전현정           최초 생성
 * </pre>
 *
 * @author 전현정(최초 작성자)
 * @version 1(클래스 버전)
 * @see
 */
@Repository
public interface LogoutRepository extends JpaRepository<Logout, Integer> {
    Logout findByLoginId(int id);
}
