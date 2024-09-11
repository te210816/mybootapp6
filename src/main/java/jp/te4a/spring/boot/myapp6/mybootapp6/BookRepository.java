@Repository
public class BookRepository {

    private final ConcurrentMap<Integer, BookBean> bookMap
                                                  = new ConcurrentHashMap<>();
                                                  public BookBean save(BookBean bookBean) {
                                                    return bookMap.put(bookBean.getId(), bookBean);
                                                }
                                            
                                                public void delete(Integer bookId) {
                                                    bookMap.remove(bookId);
                                                }
                                            
                                                public List<BookBean> findAll() {
                                                    return new ArrayList<>(bookMap.values());
                                                }
                                            }
                                            