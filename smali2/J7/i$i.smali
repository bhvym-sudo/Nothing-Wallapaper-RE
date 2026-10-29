.class final LJ7/i$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i;->k0(ZLm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF8/l;


# direct methods
.method constructor <init>(LF8/l;)V
    .registers 2

    iput-object p1, p0, LJ7/i$i;->a:LF8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lg3/x;Lg3/x;I)V
    .registers 4

    iget-object p0, p0, LJ7/i$i;->a:LF8/l;

    if-nez p2, :cond_5

    goto :goto_6

    :cond_5
    move-object p1, p2

    :goto_6
    const/4 p2, 0x0

    invoke-interface {p0, p1, p2}, LF8/l;->k(Ljava/lang/Object;Lv8/l;)V

    return-void
.end method
