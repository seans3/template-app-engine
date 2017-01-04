package io.seansullivan.template;


import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


/**
 * Unit tests for web application.
 */
@RunWith(JUnit4.class)
public class WebAppTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void constructorTest() {
    assertThat(false).isFalse();
  }
}

