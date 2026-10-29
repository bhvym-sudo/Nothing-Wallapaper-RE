.class public final LU5/e$B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/e;-><init>(Landroid/content/Context;LF8/L;LF8/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/text/Collator;

.field final synthetic b:LU5/e;


# direct methods
.method constructor <init>(LU5/e;)V
    .registers 2

    iput-object p1, p0, LU5/e$B;->b:LU5/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object p1

    iput-object p1, p0, LU5/e$B;->a:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public a(LS5/d;LS5/d;)I
    .registers 8

    const/4 v0, -0x1

    if-nez p1, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x1

    if-nez p2, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, LU5/e$B;->b:LU5/e;

    invoke-static {v2}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object v2

    invoke-interface {p1, v2}, LS5/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_2f

    iget-object v2, p0, LU5/e$B;->b:LU5/e;

    invoke-static {v2}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object v2

    invoke-interface {p1, v2}, LS5/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result v2

    if-eqz v2, :cond_2f

    move v2, v1

    goto :goto_30

    :cond_2f
    move v2, v3

    :goto_30
    iget-object v4, p0, LU5/e$B;->b:LU5/e;

    invoke-static {v4}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object v4

    invoke-interface {p2, v4}, LS5/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_55

    iget-object v4, p0, LU5/e$B;->b:LU5/e;

    invoke-static {v4}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object v4

    invoke-interface {p2, v4}, LS5/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result v4

    if-eqz v4, :cond_55

    move v3, v1

    :cond_55
    if-eqz v2, :cond_5a

    if-nez v3, :cond_5a

    return v0

    :cond_5a
    if-nez v2, :cond_5f

    if-eqz v3, :cond_5f

    return v1

    :cond_5f
    iget-object v0, p0, LU5/e$B;->a:Ljava/text/Collator;

    iget-object v1, p0, LU5/e$B;->b:LU5/e;

    invoke-static {v1}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {p1, v1}, LS5/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, LU5/e$B;->b:LU5/e;

    invoke-static {p0}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object p0

    invoke-interface {p2, p0}, LS5/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    check-cast p1, LS5/d;

    check-cast p2, LS5/d;

    invoke-virtual {p0, p1, p2}, LU5/e$B;->a(LS5/d;LS5/d;)I

    move-result p0

    return p0
.end method
