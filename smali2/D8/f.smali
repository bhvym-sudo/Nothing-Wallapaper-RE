.class public final LD8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;


# instance fields
.field private final a:LD8/h;

.field private final b:Lv8/l;

.field private final c:Lv8/l;


# direct methods
.method public constructor <init>(LD8/h;Lv8/l;Lv8/l;)V
    .registers 5

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iterator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD8/f;->a:LD8/h;

    iput-object p2, p0, LD8/f;->b:Lv8/l;

    iput-object p3, p0, LD8/f;->c:Lv8/l;

    return-void
.end method

.method public static final synthetic c(LD8/f;)Lv8/l;
    .registers 1

    iget-object p0, p0, LD8/f;->c:Lv8/l;

    return-object p0
.end method

.method public static final synthetic d(LD8/f;)LD8/h;
    .registers 1

    iget-object p0, p0, LD8/f;->a:LD8/h;

    return-object p0
.end method

.method public static final synthetic e(LD8/f;)Lv8/l;
    .registers 1

    iget-object p0, p0, LD8/f;->b:Lv8/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 2

    new-instance v0, LD8/f$a;

    invoke-direct {v0, p0}, LD8/f$a;-><init>(LD8/f;)V

    return-object v0
.end method
