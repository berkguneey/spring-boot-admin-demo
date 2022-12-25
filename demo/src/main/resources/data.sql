INSERT INTO public.parent(id, category_id, firm_id, rate) VALUES (1, '1', '1', 10);
INSERT INTO public.parent(id, category_id, firm_id, rate) VALUES (2, '2', '1', 11);
INSERT INTO public.parent(id, category_id, firm_id, rate) VALUES (3, '1', '2', 12);
INSERT INTO public.parent(id, category_id, firm_id, rate) VALUES (4, '2', '2', 13);
INSERT INTO public.parent(id, category_id, firm_id, rate) VALUES (5, '3', '2', 14);

INSERT INTO public.child(id, brand_id, rate, parent_id) VALUES (1, '1', 3, 1);
INSERT INTO public.child(id, brand_id, rate, parent_id) VALUES (2, '2', 4, 1);
INSERT INTO public.child(id, brand_id, rate, parent_id) VALUES (3, '1', 5, 3);
INSERT INTO public.child(id, brand_id, rate, parent_id) VALUES (4, '2', 6, 3);
INSERT INTO public.child(id, brand_id, rate, parent_id) VALUES (5, '3', 7, 3);
INSERT INTO public.child(id, brand_id, rate, parent_id) VALUES (6, '1', 8, 4);