.class public final LX8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/d$a;,
        LX8/d$b;
    }
.end annotation


# static fields
.field public static final a:LX8/d;

.field private static final b:[LX8/c;

.field private static final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .registers 64

    new-instance v0, LX8/d;

    invoke-direct {v0}, LX8/d;-><init>()V

    sput-object v0, LX8/d;->a:LX8/d;

    new-instance v1, LX8/c;

    sget-object v2, LX8/c;->j:Le9/h;

    const-string v3, ""

    invoke-direct {v1, v2, v3}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    new-instance v2, LX8/c;

    sget-object v4, LX8/c;->g:Le9/h;

    const-string v5, "GET"

    invoke-direct {v2, v4, v5}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    new-instance v5, LX8/c;

    const-string v6, "POST"

    invoke-direct {v5, v4, v6}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    new-instance v4, LX8/c;

    sget-object v6, LX8/c;->h:Le9/h;

    const-string v7, "/"

    invoke-direct {v4, v6, v7}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    move-object v7, v5

    new-instance v5, LX8/c;

    const-string v8, "/index.html"

    invoke-direct {v5, v6, v8}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    new-instance v6, LX8/c;

    sget-object v8, LX8/c;->i:Le9/h;

    const-string v9, "http"

    invoke-direct {v6, v8, v9}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    move-object v9, v7

    new-instance v7, LX8/c;

    const-string v10, "https"

    invoke-direct {v7, v8, v10}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    new-instance v8, LX8/c;

    sget-object v10, LX8/c;->f:Le9/h;

    const-string v11, "200"

    invoke-direct {v8, v10, v11}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    move-object v11, v9

    new-instance v9, LX8/c;

    const-string v12, "204"

    invoke-direct {v9, v10, v12}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    new-instance v12, LX8/c;

    const-string v13, "206"

    invoke-direct {v12, v10, v13}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    move-object v13, v11

    new-instance v11, LX8/c;

    const-string v14, "304"

    invoke-direct {v11, v10, v14}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    move-object v14, v12

    new-instance v12, LX8/c;

    const-string v15, "400"

    invoke-direct {v12, v10, v15}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    move-object v15, v13

    new-instance v13, LX8/c;

    move-object/from16 v62, v0

    const-string v0, "404"

    invoke-direct {v13, v10, v0}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    move-object v0, v14

    new-instance v14, LX8/c;

    move-object/from16 v16, v0

    const-string v0, "500"

    invoke-direct {v14, v10, v0}, LX8/c;-><init>(Le9/h;Ljava/lang/String;)V

    move-object v0, v15

    new-instance v15, LX8/c;

    const-string v10, "accept-charset"

    invoke-direct {v15, v10, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, LX8/c;

    move-object/from16 v17, v0

    const-string v0, "accept-encoding"

    move-object/from16 v18, v1

    const-string v1, "gzip, deflate"

    invoke-direct {v10, v0, v1}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    const-string v1, "accept-language"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v19, v0

    const-string v0, "accept-ranges"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v20, v1

    const-string v1, "accept"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v21, v0

    const-string v0, "access-control-allow-origin"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v22, v1

    const-string v1, "age"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v23, v0

    const-string v0, "allow"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v24, v1

    const-string v1, "authorization"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v25, v0

    const-string v0, "cache-control"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v26, v1

    const-string v1, "content-disposition"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v27, v0

    const-string v0, "content-encoding"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v28, v1

    const-string v1, "content-language"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v29, v0

    const-string v0, "content-length"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v30, v1

    const-string v1, "content-location"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v31, v0

    const-string v0, "content-range"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v32, v1

    const-string v1, "content-type"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v33, v0

    const-string v0, "cookie"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v34, v1

    const-string v1, "date"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v35, v0

    const-string v0, "etag"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v36, v1

    const-string v1, "expect"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v37, v0

    const-string v0, "expires"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v38, v1

    const-string v1, "from"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v39, v0

    const-string v0, "host"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v40, v1

    const-string v1, "if-match"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v41, v0

    const-string v0, "if-modified-since"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v42, v1

    const-string v1, "if-none-match"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v43, v0

    const-string v0, "if-range"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v44, v1

    const-string v1, "if-unmodified-since"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v45, v0

    const-string v0, "last-modified"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v46, v1

    const-string v1, "link"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v47, v0

    const-string v0, "location"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v48, v1

    const-string v1, "max-forwards"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v49, v0

    const-string v0, "proxy-authenticate"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v50, v1

    const-string v1, "proxy-authorization"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v51, v0

    const-string v0, "range"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v52, v1

    const-string v1, "referer"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v53, v0

    const-string v0, "refresh"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v54, v1

    const-string v1, "retry-after"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v55, v0

    const-string v0, "server"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v56, v1

    const-string v1, "set-cookie"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v57, v0

    const-string v0, "strict-transport-security"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v58, v1

    const-string v1, "transfer-encoding"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v59, v0

    const-string v0, "user-agent"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v60, v1

    const-string v1, "vary"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LX8/c;

    move-object/from16 v61, v0

    const-string v0, "via"

    invoke-direct {v1, v0, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LX8/c;

    move-object/from16 v63, v1

    const-string v1, "www-authenticate"

    invoke-direct {v0, v1, v3}, LX8/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v16

    move-object/from16 v16, v10

    move-object v10, v1

    move-object/from16 v3, v17

    move-object/from16 v1, v18

    move-object/from16 v17, v19

    move-object/from16 v18, v20

    move-object/from16 v19, v21

    move-object/from16 v20, v22

    move-object/from16 v21, v23

    move-object/from16 v22, v24

    move-object/from16 v23, v25

    move-object/from16 v24, v26

    move-object/from16 v25, v27

    move-object/from16 v26, v28

    move-object/from16 v27, v29

    move-object/from16 v28, v30

    move-object/from16 v29, v31

    move-object/from16 v30, v32

    move-object/from16 v31, v33

    move-object/from16 v32, v34

    move-object/from16 v33, v35

    move-object/from16 v34, v36

    move-object/from16 v35, v37

    move-object/from16 v36, v38

    move-object/from16 v37, v39

    move-object/from16 v38, v40

    move-object/from16 v39, v41

    move-object/from16 v40, v42

    move-object/from16 v41, v43

    move-object/from16 v42, v44

    move-object/from16 v43, v45

    move-object/from16 v44, v46

    move-object/from16 v45, v47

    move-object/from16 v46, v48

    move-object/from16 v47, v49

    move-object/from16 v48, v50

    move-object/from16 v49, v51

    move-object/from16 v50, v52

    move-object/from16 v51, v53

    move-object/from16 v52, v54

    move-object/from16 v53, v55

    move-object/from16 v54, v56

    move-object/from16 v55, v57

    move-object/from16 v56, v58

    move-object/from16 v57, v59

    move-object/from16 v58, v60

    move-object/from16 v59, v61

    move-object/from16 v60, v63

    move-object/from16 v61, v0

    filled-new-array/range {v1 .. v61}, [LX8/c;

    move-result-object v0

    sput-object v0, LX8/d;->b:[LX8/c;

    invoke-direct/range {v62 .. v62}, LX8/d;->d()Ljava/util/Map;

    move-result-object v0

    sput-object v0, LX8/d;->c:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d()Ljava/util/Map;
    .registers 5

    new-instance p0, Ljava/util/LinkedHashMap;

    sget-object v0, LX8/d;->b:[LX8/c;

    array-length v1, v0

    invoke-direct {p0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v0, v0

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v0, :cond_26

    sget-object v2, LX8/d;->b:[LX8/c;

    aget-object v3, v2, v1

    iget-object v3, v3, LX8/c;->a:Le9/h;

    invoke-virtual {p0, v3}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aget-object v2, v2, v1

    iget-object v2, v2, LX8/c;->a:Le9/h;

    invoke-interface {p0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_23
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_26
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "unmodifiableMap(result)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final a(Le9/h;)Le9/h;
    .registers 5

    const-string p0, "name"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le9/h;->v()I

    move-result p0

    const/4 v0, 0x0

    :goto_a
    if-ge v0, p0, :cond_37

    invoke-virtual {p1, v0}, Le9/h;->h(I)B

    move-result v1

    const/16 v2, 0x41

    if-gt v2, v1, :cond_34

    const/16 v2, 0x5b

    if-lt v1, v2, :cond_19

    goto :goto_34

    :cond_19
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PROTOCOL_ERROR response malformed: mixed case name: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le9/h;->y()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_34
    :goto_34
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_37
    return-object p1
.end method

.method public final b()Ljava/util/Map;
    .registers 1

    sget-object p0, LX8/d;->c:Ljava/util/Map;

    return-object p0
.end method

.method public final c()[LX8/c;
    .registers 1

    sget-object p0, LX8/d;->b:[LX8/c;

    return-object p0
.end method
