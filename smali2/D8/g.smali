.class final LD8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;


# instance fields
.field private final a:Lv8/a;

.field private final b:Lv8/l;


# direct methods
.method public constructor <init>(Lv8/a;Lv8/l;)V
    .registers 4

    const-string v0, "getInitialValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD8/g;->a:Lv8/a;

    iput-object p2, p0, LD8/g;->b:Lv8/l;

    return-void
.end method

.method public static final synthetic c(LD8/g;)Lv8/a;
    .registers 1

    iget-object p0, p0, LD8/g;->a:Lv8/a;

    return-object p0
.end method

.method public static final synthetic d(LD8/g;)Lv8/l;
    .registers 1

    iget-object p0, p0, LD8/g;->b:Lv8/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 2

    new-instance v0, LD8/g$a;

    invoke-direct {v0, p0}, LD8/g$a;-><init>(LD8/g;)V

    return-object v0
.end method
