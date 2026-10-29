.class public final synthetic Li8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Li8/e;


# direct methods
.method public synthetic constructor <init>(Li8/e;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/d;->q:Li8/e;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, Li8/d;->q:Li8/e;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p0, p1}, Li8/e;->a(Li8/e;Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method
