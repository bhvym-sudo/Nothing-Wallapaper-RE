.class final Ls7/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls7/a;->n(ZLm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls7/a;

.field final synthetic b:LF8/l;


# direct methods
.method constructor <init>(Ls7/a;LF8/l;)V
    .registers 3

    iput-object p1, p0, Ls7/a$c;->a:Ls7/a;

    iput-object p2, p0, Ls7/a$c;->b:LF8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lg3/x;Lg3/x;I)V
    .registers 5

    iget-object p3, p0, Ls7/a$c;->a:Ls7/a;

    if-nez p2, :cond_6

    move-object v0, p1

    goto :goto_7

    :cond_6
    move-object v0, p2

    :goto_7
    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {v0}, LG6/e;->s(Lg3/x;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p3, v0}, Ls7/a;->j(Ls7/a;Z)V

    iget-object p0, p0, Ls7/a$c;->b:LF8/l;

    if-nez p2, :cond_18

    move-object p2, p1

    :cond_18
    invoke-static {p2, p1}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, p1, p2}, LF8/l;->k(Ljava/lang/Object;Lv8/l;)V

    return-void
.end method
