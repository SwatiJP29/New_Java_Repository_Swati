import { TestBed } from '@angular/core/testing';

import { Empdata1Service } from './empdata1.service';

describe('Empdata1Service', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: Empdata1Service = TestBed.get(Empdata1Service);
    expect(service).toBeTruthy();
  });
});
