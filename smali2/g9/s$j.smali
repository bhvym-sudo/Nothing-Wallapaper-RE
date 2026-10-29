.class final Lg9/s$j;
.super Lg9/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "j"
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private final b:I

.field private final c:Lg9/h;

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;ILg9/h;Ljava/lang/String;)V
    .registers 5

    invoke-direct {p0}, Lg9/s;-><init>()V

    iput-object p1, p0, Lg9/s$j;->a:Ljava/lang/reflect/Method;

    iput p2, p0, Lg9/s$j;->b:I

    iput-object p3, p0, Lg9/s$j;->c:Lg9/h;

    iput-object p4, p0, Lg9/s$j;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method bridge synthetic a(Lg9/v;Ljava/lang/Object;)V
    .registers 3

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lg9/s$j;->d(Lg9/v;Ljava/util/Map;)V

    return-void
.end method

.method d(Lg9/v;Ljava/util/Map;)V
    .registers 9

    const/4 v0, 0x0

    if-eqz p2, :cond_84

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_b
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_83

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_76

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_55

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "form-data; name=\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Content-Transfer-Encoding"

    iget-object v4, p0, Lg9/s$j;->d:Ljava/lang/String;

    const-string v5, "Content-Disposition"

    filled-new-array {v5, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LP8/u;->g([Ljava/lang/String;)LP8/u;

    move-result-object v2

    iget-object v3, p0, Lg9/s$j;->c:Lg9/h;

    invoke-interface {v3, v1}, Lg9/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP8/C;

    invoke-virtual {p1, v2, v1}, Lg9/v;->d(LP8/u;LP8/C;)V

    goto :goto_b

    :cond_55
    iget-object p1, p0, Lg9/s$j;->a:Ljava/lang/reflect/Method;

    iget p0, p0, Lg9/s$j;->b:I

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Part map contained null value for key \'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'."

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p0, p2, v0}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_76
    iget-object p1, p0, Lg9/s$j;->a:Ljava/lang/reflect/Method;

    iget p0, p0, Lg9/s$j;->b:I

    const-string p2, "Part map contained null key."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p0, p2, v0}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_83
    return-void

    :cond_84
    iget-object p1, p0, Lg9/s$j;->a:Ljava/lang/reflect/Method;

    iget p0, p0, Lg9/s$j;->b:I

    const-string p2, "Part map was null."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p0, p2, v0}, Lg9/C;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method
